//WAP to check the validity of an expression wrt to the parrenthessis
#include<iostream>
#include<stack>
#include<string>
using namespace std;

bool isValid(string exp)
{
	stack<char> S;
    
    for(char c: exp)   
    {
        if (c == '(' || c ==  '['|| c == '{')
        S.push(c);
            
        else if (c == ')' || c == ']' || c== '}')
        {   if (S.empty()) 
            return false;

            char top = S.top();

            if (( c == ')' && top != '(') ||( c == '[' && top != ']') ||
            ( c == '{' && top != '}') )	
            return false;
            S.pop();
        }
    }

    return S.empty();
}

int main(){
	string exp;
	cout<<"Enter Mathematical Expression: ";
	cin>>exp;
	cout<< (isValid(exp) ? "Valid" : "Invalid") << endl;
	return 0;
}
