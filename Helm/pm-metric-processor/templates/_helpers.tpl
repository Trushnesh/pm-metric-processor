{{/* vim: set filetype=mustache: */}}
{{/*
Expand the name of the chart.
*/}}
{{- define "pm-metric-processor.name" -}}
{{- default .Chart.Name .Values.nameOverride | trunc 63 | trimSuffix "-" -}}
{{- end -}}


{{/*
Create chart name and version as used by the chart label.
*/}}
{{- define "pm-metric-processor.chart" -}}
{{- printf "%s-%s" .Chart.Name .Chart.Version | replace "+" "_" | trunc 63 | trimSuffix "-" -}}
{{- end -}}



{{/*
Labels
*/}}
{{- define "pm-metric-processor.labels" }}
{{- include "pm-metric-processor.selectorLabels" . }}
  app.kubernetes.io/version: {{ include "pm-metric-processor.chart" . | quote }}
  app.kubernetes.io/managed-by: {{ .Release.Service | quote  }}
{{- end }}

{{/*
Selector labels.
*/}}
{{- define "pm-metric-processor.selectorLabels" }}
  app.kubernetes.io/name: {{ include "pm-metric-processor.name" . | quote }}
  app.kubernetes.io/instance: {{ .Release.Name | quote }}
{{- end }}
