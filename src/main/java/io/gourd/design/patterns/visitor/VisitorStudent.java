/*
 *
 * The MIT License Copyright © 2018-2018 GourdErwa
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the "Software"), to deal in the Software without restriction, including without limitation the
 * rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR
 * OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package io.gourd.design.patterns.visitor;

import lombok.extern.slf4j.Slf4j;

/**
 * 学生类型的访问者
 *
 * @author wei.Li by 2018-11-24
 */
@Slf4j
public class VisitorStudent implements Visitor {

    @Override
    public void visit(ElementLongPrice element) {
        final double realPrice = element.getRealPrice();
        log.info("学生 看到[{}]价格真实价[{}],显示价格[{}]", element.getName(), realPrice, realPrice);
    }

    @Override
    public void visit(ElementLowPrice element) {
        final double realPrice = element.getRealPrice();
        log.info("学生 看到[{}]价格真实价[{}],显示价格[{}]", element.getName(), realPrice, realPrice);
    }

}
