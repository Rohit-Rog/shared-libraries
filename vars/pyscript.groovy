def call(){
	def py = libraryResource('func.py')
	writeFile file: "pyscript.py", text: py
	bat 'C:/Users/LENOVO/AppData/Local/Programs/Python/Python39/python.exe pyscript.py'
}