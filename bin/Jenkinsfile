pipeline{
    agent any
    stages{
        stage('Build'){
            steps{
                #get the souce code from git repository
                git 'https://github.com/Siddharth0337/Petadoption-project.git'
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