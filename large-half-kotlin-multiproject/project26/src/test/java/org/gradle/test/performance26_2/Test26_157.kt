package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_157 {
    private val production = Production26_157("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}