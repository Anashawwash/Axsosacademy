from flask import Flask ,render_template,request, redirect , session

app = Flask(__name__)
app.secret_key = 'i dont now what is this'

@app.route('/' , methods = ['POST','GET'])
def App_main_page():
    if request.method == 'POST':
        session['user_name'] = request.form['user_name']
        session['anas']= request.form['City']
        session['language'] = request.form['fav_language']
        session['comment'] = request.form['speak']
        return redirect('/result')
    else:
        return render_template('index.html')

@app.route('/result')
def Display_info():
    return render_template('info.html',username = session['user_name'], anas =  session['anas'],language =  session['language'],comment = session['comment'])

if __name__== "__main__":
    app.run(debug = True)