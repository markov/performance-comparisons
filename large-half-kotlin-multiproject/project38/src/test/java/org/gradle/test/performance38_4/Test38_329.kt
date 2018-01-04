package org.gradle.test.performance38_4

import org.junit.Assert.*

class Test38_329 {
    private val production = Production38_329("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}