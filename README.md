# Example project to use Quarkus + AWS Lambda with Kotlin

# Build and Deploy

Build the project using maven:
 `mvn clean install`

Build a native project (GraalVM must already be installed):
`mvn clean install -Dnative`

## Simulate AWS Lambda deployment:
Run locally:
`sam local start-api --template sam.jvm.yaml`

Invoke the example lambda in your browser by going to: http://127.0.0.1:3000/hello

If you want to deploy a native GraalVM executable of your lambda, use a different yaml:
`sam local start-api --template sam.native.yaml`

## Deploy to AWS

Package your deployment:
`sam package --template-file sam.jvm.yaml --output-template-file packaged.yaml --s3-bucket <YOUR_S3_BUCKET>`

Deploy your package:
`sam deploy --template-file packaged.yaml --capabilities CAPABILITY_IAM --stack-name <YOUR_STACK_NAME>`

For more information concerning build and deploy, see the offical [quarkus website](https://quarkus.io/guides/amazon-lambda-http)

Want to add Oauth2? See the [quarkus website](https://quarkus.io/guides/security-oauth2) for an excellent explanation. 

