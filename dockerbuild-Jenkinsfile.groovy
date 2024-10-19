pipeline{
    agent any 
    stages{
        stage("git pull"){
            steps{
                git url: "https://github.com/LondheShubham153/django-notes-app.git", branch: "main"
            }
        }
        stage("DOcker build"){
            steps{
                sh "docker build . -t django:latest"
            }
        }
        stage ("Deploy"){
            steps{
                sh "docker run -d -p 8000:8000 --name django django:latest"
            }
        }
        
    }
}