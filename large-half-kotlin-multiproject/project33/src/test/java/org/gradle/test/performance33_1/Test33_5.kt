package org.gradle.test.performance33_1

import org.junit.Assert.*

class Test33_5 {
    private val production = Production33_5("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}