# HW15TaskBrackets

## Условия задачи:

Реализовать функцию:

Функция проверяет корректность расстановки скобок. На вход функции поступает строка, содержащая в себе скобки [ ] { } ( ), а так же любые другие символы.

Функция возвращает -1 в случае, если скобки расставлены правильно, иначе необходимо вывести первое место, где обнаружена ошибка. В первую очередь необходимо найти закрывающую скобку, для которой нет соответствующей открывающей (например, скобка ‘]’ в строке “]( )”). Если таких ошибок нет, необходимо найти первую открывающую скобку, для которой нет соответствующей закрывающей (скобка ‘(‘ в строке “{ } ( [ ]”)

Примеры:

[ ] -> -1

{ [ ] } -> -1

{ -> 1

foo(bar) -> -1

foo(bar[i) -> 10
