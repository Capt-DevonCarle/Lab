/*WAP to evaluate postfix expressions*/
#include <stdio.h>
#include <ctype.h>
#include <stdlib.h>
#include <string.h>

#define MAX 100
#define POSTFIXSIZE 100

int stack[MAX];
int top = -1;

void push(int item)
{
    if(top >= MAX - 1)
    {
        printf("Stack Overflow\n");
        return;
    }

    top++;
    stack[top] = item;
}

int pop()
{
    if(top < 0)
    {
        printf("Error: Stack Underflow\n");
        return -1;
    }

    return stack[top--];
}

int EvalPostfix(char postfix[])
{
    int i;
    int A, B, val;
    int hasTokenSeparators = 0;

    top = -1;

    for(i = 0; postfix[i] != '\0'; i++)
    {
        if(postfix[i] == ' ' || postfix[i] == '\t   ')
        {
            hasTokenSeparators = 1;
            break;
        }
    }

    if(hasTokenSeparators)
    {
        char *token = strtok(postfix, " \t\n\r");

        while(token != NULL)
        {
            char *endPtr;
            long number = strtol(token, &endPtr, 10);

            if(*endPtr == '\0')
            {
                push((int)number);
            }
            else if(token[1] == '\0' && (token[0] == '+' || token[0] == '-' || token[0] == '*' || token[0] == '/'))
            {
                if(top < 1)
                {
                    printf("Error: Invalid postfix expression\n");
                    return 0;
                }

                A = pop();
                B = pop();

                if(token[0] == '/' && A == 0)
                {
                    printf("Error: Division by zero\n");
                    return 0;
                }

                switch(token[0])
                {
                    case '+':
                        val = B + A;
                        break;

                    case '-':
                        val = B - A;
                        break;

                    case '*':
                        val = B * A;
                        break;

                    case '/':
                        val = B / A;
                        break;
                }

                push(val);
            }
            else
            {
                printf("Error: Invalid token '%s'\n", token);
                return 0;
            }

            token = strtok(NULL, " \t\n\r");
        }
    }
    else
    {
        char ch;

        for(i = 0; postfix[i] != '\0'; i++)
        {
            ch = postfix[i];

            if(isspace((unsigned char)ch))
            {
                continue;
            }

            if(isdigit((unsigned char)ch))
            {
                push(ch - '0');
            }
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                if(top < 1)
                {
                    printf("Error: Invalid postfix expression\n");
                    return 0;
                }

                A = pop();
                B = pop();

                if(ch == '/' && A == 0)
                {
                    printf("Error: Division by zero\n");
                    return 0;
                }

                switch(ch)
                {
                    case '+':
                        val = B + A;
                        break;

                    case '-':
                        val = B - A;
                        break;

                    case '*':
                        val = B * A;
                        break;

                    case '/':
                        val = B / A;
                        break;
                }

                push(val);
            }
            else
            {
                printf("Error: Invalid character '%c'\n", ch);
                return 0;
            }
        }
    }

    if(top != 0)
    {
        printf("Error: Invalid postfix expression\n");
        return 0;
    }

    printf("Result = %d\n", pop());
    return 1;
}

int main()
{
    char postfix[POSTFIXSIZE];

    printf("Enter postfix expression: ");
    if(fgets(postfix, sizeof(postfix), stdin) == NULL)
    {
        printf("Error: Failed to read input\n");
        return 1;
    }

    if(!EvalPostfix(postfix))
    {
        return 1;
    }

    return 0;
}