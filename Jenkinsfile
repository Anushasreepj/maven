pipeline {
    agent any
    tools{
        maven 'MAVEN _HOME'
    }
    stages {
        stage('Build') {
            steps{
                sh 'mvn clean package'
        }
        
        stage ('Deploy to tomcat server'){
          steps{
                deploy adapters: [tomcat8(credentialsId: 'af300c04-859c-4be3-802c-165604a7231c', path: '', url: 'http://54.153.158.154:8088/')], contextPath: null, war: '**/*.war'
            }
        }
        }
    }
}
  
