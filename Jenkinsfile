pipeline
{
    agent any
    environment {
       NEW_VERSION = '1.3.0'
       SERVER_CREDENTIALS = credentials('server-credentials')
    }
        stages
        {
            stage("build")
            {
                steps {
                    echo "building the application"
                }
            }
             stage("test")
            {
                steps {
                    echo "testing the application"
                }
            }
               stage("deploy")
            {
                steps {
                    echo "deploying the application"
                    echo "deploying with ${SERVER_CREDENTIALS}"
                     withCredentials([
                     usernamePassword(credentials:'server-credentials', usernameVariable:'USER', passwordVarialble:'PWD')])
                     echo "username ${USER}, password ${PWD}"

                }
            }


    }
}
