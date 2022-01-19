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
                    sh "deploying with ${SERVER_CREDENTIALS}"
                    withCredentials([
                    usernamePassword(credentials:'server-credentials', usernameVariable:'USER', passwordVarialble:'PWD')])
                    sh "username ${USER}, password ${PWD}"

                }
            }


    }
}
