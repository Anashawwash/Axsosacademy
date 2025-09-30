from flask import Flask, render_template , request, redirect

app = Flask(__name__)

@app.route('/', methods=['POST','GET'])
def Form():
    if request.method == 'POST':
        print(request.form)
        name = request.form['name'] 
        email = request.form['email']   
        return redirect("/good_job")
    else:
        return render_template('index.html')

@app.route('/good_job')
def Fom():
    return "will done"
    
    
if __name__ == "__main__":
    app.run(debug = True)
