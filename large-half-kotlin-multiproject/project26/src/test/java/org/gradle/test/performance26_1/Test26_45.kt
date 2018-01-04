package org.gradle.test.performance26_1

import org.junit.Assert.*

class Test26_45 {
    private val production = Production26_45("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}