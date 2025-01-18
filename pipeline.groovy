pipeline {
    agent any
    stages {
        stage('Clone Repository') {
            steps {
                // Clone the repository from GitHub
                git branch: 'main', url: 'https://github.com/pasindu-jayasena/Devops-Test.git'
            }
        }
        stage('Install Dependencies') {
            steps {
                // Install required Python dependencies
                sh 'pip install -r requirements.txt || true'
            }
        }
        stage('Run Python Script') {
            steps {
                // Execute the Python script
                sh 'test.py'
            }
        }
    }
}
