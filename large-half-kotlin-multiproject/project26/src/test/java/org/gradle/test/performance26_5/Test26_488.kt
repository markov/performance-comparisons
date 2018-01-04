package org.gradle.test.performance26_5

import org.junit.Assert.*

class Test26_488 {
    private val production = Production26_488("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}