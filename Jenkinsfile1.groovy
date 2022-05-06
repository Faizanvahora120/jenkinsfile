pipeline {
    agent any 
        stages
        {
            stage('Download')
            {
                steps
                {
                    bat 'https://github.com/Faizanvahora120/jenkinsfile.git'
                }
            }
           stage('Deployment')
           {
               steps
               {
                 bat 'kubectl apply -f pod-definition1.yml'       
               }
           }
        }
    }