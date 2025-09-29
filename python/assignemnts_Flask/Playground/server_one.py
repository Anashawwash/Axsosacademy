from flask import Flask,render_template

app = Flask(__name__)




@app.route('/play')
def Hello():
    return render_template('index.html',x=3,color ="lightblue")


@app.route('/play/<int:x>')
def Hello_one(x):
    return render_template('index.html',x = x , color ="lightblue")


@app.route('/play/<int:x>/<color>')
def Hello_Color(x,color):
    return render_template('index.html',x = x, color=color)


    
if __name__ == "__main__":
    app.run(debug = True)
    