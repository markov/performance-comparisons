package org.gradle.test.performance33_1

import org.junit.Assert.*

class Test33_31 {
    private val production = Production33_31("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}