# Vert.x Test Application w/ Google AppEngine

Requires: 
* openjdk11
* gradle (built with Gradle 6+)
* gcloud

To auth: 
`gcloud auth login`

to deploy: 
`gradle appengineDeploy`

(it will then deploy the jar as specified in the app.yaml and staged-app directory)