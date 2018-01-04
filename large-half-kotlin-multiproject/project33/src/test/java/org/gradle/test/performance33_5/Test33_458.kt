package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_458 {
    private val production = Production33_458("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}