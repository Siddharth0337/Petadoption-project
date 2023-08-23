pipeline{
    agent any
    tools {
        // Specify the name of the Git installation configured in Jenkins
        git 'MyGitInstallation'
   
    }
    stages{
        stage('Build'){
            steps{
                // Get the source code from the git repo
                checkout scm
                #Run wrapper commands
                sh "./mvnw clean compile"
                echo "building the project with maven complile"
            }
            

        }
            stage('Test'){
                steps{

                #Run wrapper commands
                sh "./mvnw clean test"
                echo "Testing the project with maven Test"
            }

      }
             stage('Package'){
                steps{

                #Run wrapper commands
                sh "./mvnw clean package"
                echo "packaging the project with maven Package"
            }
     }

    }
}