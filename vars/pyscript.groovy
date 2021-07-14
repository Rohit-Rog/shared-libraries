def call(){
	script{
		def py = libraryResource('func.py')
		bat 'python py'
	}
}