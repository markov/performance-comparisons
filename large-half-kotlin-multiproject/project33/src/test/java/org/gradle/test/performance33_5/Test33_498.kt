package org.gradle.test.performance33_5

import org.junit.Assert.*

class Test33_498 {
    private val production = Production33_498("value")

    @org.junit.Test
    fun test() {
        assertEquals(production.property, "value")
    }
}