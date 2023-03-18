pipeline {
    environment{
        imageName = ""
    }
    agent any

    stages {
        stage('Git Pull stage') {
            steps {
                // Get some code from a GitHub repository
                git 'https://github.com/TanishqJ13/Scientific-Calculator'
            }
        }
        stage('Maven Build'){
            steps{
                script{
                    sh 'mvn clean install'
                    
                } 
            }
        }
    }
}
