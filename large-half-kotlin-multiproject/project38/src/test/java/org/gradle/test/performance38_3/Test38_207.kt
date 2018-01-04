package org.gradle.test.performance38_3

import org.junit.Assert.*

class Test38_207 {
    private val production = Production38_207("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}