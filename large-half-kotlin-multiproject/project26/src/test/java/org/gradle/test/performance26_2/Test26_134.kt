package org.gradle.test.performance26_2

import org.junit.Assert.*

class Test26_134 {
    private val production = Production26_134("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}