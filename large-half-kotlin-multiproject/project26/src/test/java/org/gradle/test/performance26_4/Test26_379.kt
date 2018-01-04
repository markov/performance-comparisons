package org.gradle.test.performance26_4

import org.junit.Assert.*

class Test26_379 {
    private val production = Production26_379("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}