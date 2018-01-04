package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_418 {
    private val production = Production33_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}