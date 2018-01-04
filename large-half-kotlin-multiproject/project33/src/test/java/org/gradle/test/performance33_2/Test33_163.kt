package org.gradle.test.performance33_2

import org.junit.Assert.*

class Test33_163 {
    private val production = Production33_163("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}