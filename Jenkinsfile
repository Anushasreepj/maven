pipeline {
    agent any
    tools{
        maven 

    stages {
        stage('Build') {
            steps{
                sh 'mvn clean package'
        }
            post{
                sucess{
                    echo "Archiving the Artifacts"
                    archieveArtifacts artifacts: '**/target/*.war'
                }
            }
        }
        stage ('Deploy to tomcat server')
            {
                sh 'make'
            }
        }
    }
}
