package org.gradle.test.performance33_1

import org.junit.Assert.*

class Test33_42 {
    private val production = Production33_42("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}