package org.gradle.test.performance33_3

import org.junit.Assert.*

class Test33_217 {
    private val production = Production33_217("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}