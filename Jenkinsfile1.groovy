pipeline {
    agent any 
        stages
        {
            stage('Download')
            {
                steps
                {
                    git branch: 'main', url: 'https://github.com/Faizanvahora120/jenkinsfile.git'
                }
            }
           stage('Deployment')
           {
               steps
               {
                 sh 'kubectl apply -f pod-definition1.yml' 
               }
           }
        }
    }