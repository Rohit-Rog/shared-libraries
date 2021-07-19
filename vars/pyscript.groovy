def call(){
	withPythonEnv('python3'){
		bat 'python libraryResource('func.py')'
	}
}