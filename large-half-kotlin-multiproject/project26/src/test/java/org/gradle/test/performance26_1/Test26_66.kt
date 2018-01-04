package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_66 {
    private val production = Production26_66("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}