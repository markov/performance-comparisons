package org.gradle.test.performance33_2

import org.junit.Assert.*

class Test33_157 {
    private val production = Production33_157("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}