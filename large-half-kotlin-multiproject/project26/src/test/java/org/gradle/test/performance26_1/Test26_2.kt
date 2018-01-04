package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_2 {
    private val production = Production26_2("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}