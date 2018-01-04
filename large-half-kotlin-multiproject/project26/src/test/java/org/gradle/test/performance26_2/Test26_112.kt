package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_112 {
    private val production = Production26_112("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}