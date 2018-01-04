package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_33 {
    private val production = Production26_33("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}