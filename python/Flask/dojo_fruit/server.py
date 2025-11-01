from flask import Flask, render_template, request, redirect , session
app = Flask(__name__)  
app.secret_key = 'i dont now what is this'

@app.route('/')         
def index():
    return render_template("index.html")

@app.route('/checkout', methods=['POST'])         
def checkout():
    session['strawberry'] = request.form['strawberry']
    session['raspberry'] = request.form['raspberry']
    session['apple'] = request.form['apple']
    session['first_name'] = request.form['first_name']
    session['last_name'] = request.form['last_name']
    session['id'] = request.form['student_id']
    sum = int(request.form['strawberry']) + int(request.form['raspberry']) + int(request.form['apple'])
    print(f"Charging {request.form} for {sum} fruits")
    return render_template("checkout.html",strawberry = session['strawberry'],
    raspberry = session['raspberry'],apple = session['apple'],First_name = session['first_name']
    ,  Last_name = session['last_name'],id = session['id'] ,sum = sum)

@app.route('/fruits')         
def fruits():
    return render_template("fruits.html")

if __name__=="__main__":  
    app.run(debug=True)