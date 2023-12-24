import itertools


def evaluate_expression(expression):
    try:
        return eval(expression)
    except ZeroDivisionError:
        return None


def find_24(numbers):
    operators = ['+', '-', '*', '/']

    for perm in itertools.permutations(numbers):
        for op1 in operators:
            for op2 in operators:
                for op3 in operators:
                    # 枚举所有可能的运算符排列组合
                    exp1 = f'({perm[0]} {op1} {perm[1]})'
                    exp2 = f'({exp1} {op2} {perm[2]})'
                    exp3 = f'({exp2} {op3} {perm[3]})'

                    # 尝试计算表达式并检查是否等于24
                    result = evaluate_expression(exp3)
                    if result is not None and abs(result - 24) < 1e-6:
                        return exp3

    return None


# 输入四个数字
numbers = [int(input(f'输入第{i + 1}个数字：')) for i in range(4)]

expression = find_24(numbers)
if expression is not None:
    print(f'可以得到24：{expression}')
else:
    print('无法得到24。')
