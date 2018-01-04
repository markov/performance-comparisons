package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_458 {
    private val production = Production26_458("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}