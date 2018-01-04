package org.gradle.test.performance38_5

import org.junit.Assert.*

class Test38_418 {
    private val production = Production38_418("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}