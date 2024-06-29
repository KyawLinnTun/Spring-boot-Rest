pipeline {
	agent any

	environment {
		mavenHome = tool 'jenkins-maven'
	}

	tools {
		jdk 'java-21'
	}

	stages {

		stage('Build'){
			steps {
				bat "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				bat "mvn test"
			}
		}
		
		stage('Docker Build') {
		      steps {
		        bat 'docker build -t spring-boot-pipeline .'
         }
      }
      
      stage('Docker Push') {
	      agent any
	      steps {
	        withCredentials([usernamePassword(credentialsId: 'dockerHub', passwordVariable: 'dockerHubPassword', usernameVariable: 'dockerHubUser')]) {
	          bat "docker login -u ${env.dockerHubUser} -p ${env.dockerHubPassword}"
	          bat 'docker push spring-boot-pipeline'
	        }
      }

		
	}
}