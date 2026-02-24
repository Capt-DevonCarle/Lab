// WAP to validate brackets in an expression using stack
#include <stdio.h>
#include <string.h>

int main()
{
    char exp[100];
    printf("Enter expression: ");
    if (fgets(exp, sizeof(exp), stdin) == NULL)
    {
        printf("Invalid expression\n");
        return 0;
    }

    exp[strcspn(exp, "\n")] = '\0';

    int len = (int)strlen(exp);
    char stack[100];
    int top = -1;

    for (int i = 0; i < len; i++)
    {
        if (exp[i] == '(' || exp[i] == '[' || exp[i] == '{')
        {
            if (top == 99)
            {
                printf("Invalid expression\n");
                return 0;
            }

            top++;
            stack[top] = exp[i];
        }
        else if (exp[i] == ')' || exp[i] == ']' || exp[i] == '}')
        {
            if (top == -1)
            {
                printf("Invalid expression\n");
                return 0;
            }

            char popped = stack[top];
            top--;

            if ((exp[i] == ')' && popped != '(') || (exp[i] == ']' && popped != '[') || (exp[i] == '}' && popped != '{'))
            {
                printf("Invalid expression\n");
                return 0;
            }
        }
    }

    if (top == -1)
        printf("Valid expression\n");
    else
        printf("Invalid expression\n");

    return 0;
}
