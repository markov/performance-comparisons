package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_289 {
    private val production = Production38_289("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}