package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_188 {
    private val production = Production26_188("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}