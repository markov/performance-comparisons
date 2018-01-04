package org.gradle.test.performance33_1

import org.junit.Assert.*

class Test33_100 {
    private val production = Production33_100("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}