from flask import Flask

app = Flask(__name__)


@app.route('/')
def hello_world():
    return 'Hello World!'


@app.route('/Champion')
def champion():
    return 'Champion!'


@app.route('/say/Flask')
def say_flask():
    return 'Hi Flask!'


@app.route('/say/Michael')
def say_michael():
    return 'Hi Michael!'


@app.route('/say/John')
def say_john():
    return 'hi John!'


@app.route('/repeat/<int:num>/<word>')
def repeat(num, word):
    temp_str = ""
    for i in range(num):
        temp_str += f"{word} "
    return temp_str


@app.errorhandler(404)
def page_not_found(e):
    return 'Sorry! No response. Try again.'


if __name__ == "__main__":
    app.run(debug=True)
